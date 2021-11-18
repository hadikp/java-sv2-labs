package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public SalesPerson selectSalesPersonWithMaxSalesAmount(List<SalesPerson> sales) {
        SalesPerson personMaxSales = sales.get(0);
        for (SalesPerson sp: sales) {
            if (sp.getAmount() > personMaxSales.getAmount()) {
                personMaxSales = sp;
            }
        }
        return personMaxSales;
    }

    public SalesPerson selectSalesPersonWithFurthestAboveTarget(List<SalesPerson> sales) {
        SalesPerson personTargetPlus = sales.get(0);
        for (int i = 1; i < sales.size(); i++) {
            if (sales.get(i-1).getAmountMinusTarget() > sales.get(i).getAmountMinusTarget()) {
                personTargetPlus = sales.get(i-1);
            }
        }
        return personTargetPlus;
    }

    public SalesPerson selectSalesPersonWithFurthestBelowTarget(List<SalesPerson> sales) {
        SalesPerson personTargetMinus = sales.get(0);
        for (int i = 1; i < sales.size(); i++) {
            if (sales.get(i-1).getAmountMinusTarget() > sales.get(i).getAmountMinusTarget()) {
                personTargetMinus = sales.get(i);
            }
        }
        return personTargetMinus;
    }

}

package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String st: billItems) {
            String[] billSplit = st.split(";");
            int price = Integer.parseInt(billSplit[1]);
            int db = Integer.parseInt(billSplit[2]);
            String readLine = String.format("%s, %d * %d = %d Ft", billSplit[0], db, price, db * price);
            sb.append(readLine);
            sb.append("`\n");
        }

        return sb.toString();
    }
}

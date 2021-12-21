package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {
        Plan plan = new SketchPlan(110, "Document title");
        Plan plan1 = new PermitPlan(110, "Document title", "Hadik Péter", "Veszprém");
        Plan plan2 = new ConstructionPlan(110, "Document title", "Hadik Péter",
                "Veszprém", 11);

        System.out.println(plan.getPagesOfDocumentation());
        System.out.println(plan1.getPagesOfDocumentation());
        System.out.println(plan2.getPagesOfDocumentation());
        System.out.println();

        SketchPlan  sketchPlan  = new SketchPlan(110, "Document title");
        Plan sketchPlan1 = new PermitPlan(110, "Document title", "Hadik Péter", "Veszprém");
        Plan sketchPlan2 = new ConstructionPlan(110, "Document title", "Hadik Péter",
                "Veszprém", 11);
        System.out.println(sketchPlan.getTitle());
        System.out.println(plan1.getPagesOfDocumentation());
        System.out.println();

        Header   header = new PermitPlan(110, "Document title", "Hadik Péter", "Veszprém");
        Header   header1 = new ConstructionPlan(110, "Document title", "Hadik Péter",
                "Veszprém", 11);
        System.out.println(header.getNameOfClient());
        System.out.println(header.getAddressOfBuilding());
        System.out.println();

        PermitPlan   permitPlan = new PermitPlan(110, "Document title", "Hadik Péter", "Veszprém");
        PermitPlan   permitPlan1 = new ConstructionPlan(110, "Document title", "Hadik Péter",
                "Veszprém", 11);
        System.out.println(permitPlan.getTitle());
        System.out.println(permitPlan.getHeader());
        System.out.println(permitPlan.getAddressOfBuilding());
        System.out.println(permitPlan.getNameOfClient());
        System.out.println(permitPlan.getPagesOfDocumentation());
        System.out.println();

        ConstructionPlan   constructionPlan = new ConstructionPlan(110, "Document title", "Hadik Péter",
                "Veszprém", 11);
        System.out.println(permitPlan.getTitle());
        System.out.println(permitPlan.getHeader());
        System.out.println(permitPlan.getAddressOfBuilding());
        System.out.println(permitPlan.getNameOfClient());
        System.out.println(permitPlan.getPagesOfDocumentation());
        System.out.println();
    }
}

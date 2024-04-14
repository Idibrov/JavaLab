class JavaProgram {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();

        house1.setValues(2, 2000, "Small house");
        house2.setValues(3, 1995, "Big house");

        house1.printDetails();
        System.out.println("Years: " + house1.getYearsSinceConstruction());

        house2.printDetails();
        System.out.println("Years: " + house2.getYearsSinceConstruction());
    }
}

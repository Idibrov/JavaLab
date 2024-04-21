class House {
    private int floors;
    private int year;
    private String name;

    public void setValues(int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    public void printDetails() {
        System.out.println("Floors: " + floors);
        System.out.println("Year: " + year);
        System.out.println("Name: " + name);
    }

    public int getYearsSinceConstruction() {
        return 2024 - year;
    }
}

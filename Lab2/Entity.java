class Entity {
    private int id;
    private String name;

    public Entity() {
        this.id = 0;
        this.name = "Name";
    }

    public Entity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Entity {" + "id=" + id + ", name='" + name + '}';
    }
}


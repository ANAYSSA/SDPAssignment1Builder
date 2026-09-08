public class Pizza {
private String name;
private String size;
private int temp;
private boolean vegan;

public Pizza(Builder builder){
    this.name = builder.name;
    this.size = builder.size;
    this.temp = builder.temp;
    this.vegan = builder.vegan;
}

public String getName(){
    return this.name;
}


@Override
public String toString(){
    return "Pizza{" +
            "name='" + name + '\'' +
            ", size='" + size + '\'' +
            ", temp=" + temp +
            ", vegan=" + vegan +
            '}';
}

public static class Builder{
    private String name;
    private String size;
    private int temp;
    private boolean vegan;

    public Builder setName(String name){
        this.name = name;
        return this;
    }

    public Builder setSize(String size){
        this.size = size;
        return this;
    }
    public Builder setTemp(int t){
        this.temp = t;
        return this;
    }
    public Builder setVegan(boolean v){
        this.vegan = v;
        return this;
    }

    public Pizza build() {
        if (name == null || name.isBlank()

                || temp < 100 || temp > 400) {

            throw new IllegalArgumentException("Invalid pizza parameters");
        }

        return new Pizza(this);
    }





    }




}


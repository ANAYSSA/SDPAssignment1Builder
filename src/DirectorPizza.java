public class DirectorPizza {

public Pizza makeMargarita(){
    Pizza.Builder builder = new Pizza.Builder();
    builder.setName("Margarita");
    builder.setSize("Medium");
    builder.setTemp(100);
    builder.setVegan(false);
    return builder.build();
}

public Pizza makeOwn(String name,String size, String temp,boolean vegan ){
    Pizza.Builder builder = new Pizza.Builder();
    builder.setName(name);
    builder.setSize(size);
    builder.setTemp(Integer.parseInt(temp));
    builder.setVegan(vegan);
    return builder.build();
}

}

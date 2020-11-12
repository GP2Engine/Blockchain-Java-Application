import com.google.gson.GsonBuilder;

/*
METAPTYXIAKO Prohgmena Systhmata Plhroforikhs 2019
Ergasia: Blockchain JAVA
Onoma: Anastasios
Epwnymo: Kollias
A.M: MPSP19018

VERSION 2: Multi Thread (with executor Service)
 */

public class Products {
    public String code;
    public String title;
    public float price;
    public String description;
    public String category;

    public Products(String code, String title, float price, String description,String category)
    {
        this.code = code;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public String jsonMaker()
    {
        String json = new GsonBuilder().setPrettyPrinting().create().toJson(this);
        return json;
    }

}

package dicj.info.ageecj;

/**
 * Created by utilisateur on 2017-01-31.
 */
public class ListModel {

    private String AbrevEven="";
    private  String DateEven="";

    /*********** Set Methods ******************/

    public void setAbrevEven (String AbrevEven){
        this.AbrevEven = AbrevEven;
    }

    public void setDateEven (String DateEven){
        this.DateEven = DateEven;
    }

    /*********** Get Methods ****************/

    public String getAbrevEven(){
        return this.AbrevEven;
    }

    public String getDateEven() {
        return this.DateEven;
    }
}

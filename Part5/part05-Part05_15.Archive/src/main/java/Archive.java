
/**
 *
 * @author Flavio
 */
public class Archive {
    
    private String Id;
    private String name;
    
    public Archive(String Id, String name) {
        this.Id = Id;
        this.name = name;
    }
    
    public String getId() {
        return this.Id;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Archive)) {
            return false;
        }
        
        Archive comparedItens = (Archive) compared;
        if (this.Id.equals(comparedItens.Id)) {
            return true;
        }
        
        return false;
    }
}

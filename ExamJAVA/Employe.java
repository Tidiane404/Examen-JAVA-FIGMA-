public class Employe implements IEmploye
{
    private int id;
    private String nomComplet;
    private String dateEmbauche;
    private static int nbreEmployeF;

    private Service service;
    public Service getService()
    {
        return service;
    }
    public void setService(Service service)
    {
        this.service=service;
    }

    public Employe()
    {
        nbreEmployeF++;
        id=nbreEmployeF;
    }

    public Employe(String nomComplet, String dateEmbauche){
        nbreEmployeF++;
        id=nbreEmployeF;
        setnomComplet(nomComplet);
        setDateEmbauche(dateEmbauche);
    }

    public int getId(){
        return id;
    }
    public String getnomComplet(){
        return nomComplet;
    }
    public String getDateEmbauche(){
        return dateEmbauche;
    }
    public static int getnbreEmployeF(){
        return nbreEmployeF;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setnomComplet(String nomComplet){
        this.nomComplet=nomComplet;
    }
    public void setDateEmbauche(String dateEmbauche){
        this.dateEmbauche=dateEmbauche;
    }
    public static void setnbreEmployeF(int nbreEmployeF){
        Employe.nbreEmployeF=nbreEmployeF;
    }

    @Override
    public  String affiche(){
        return "Id: "+id+"\n Nom Complet: "+nomComplet+"\n Date d'embauche: "+dateEmbauche;
    }
    public void compare(){

    }

}
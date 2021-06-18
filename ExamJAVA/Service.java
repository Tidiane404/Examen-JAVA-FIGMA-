public class Service implements IEmploye
{
    private int id;
    private String libelle;
    private static int nbreService;

    private Employe[] tabEmploye=new Employe[10];
    private int nbreEmploy;
    
    public Service()
    {
        nbreService++;
        id=nbreService;
    }

    public Service(String libelle)
    {
        nbreService++;
        id=nbreService;
        setLibelle(libelle);
    }

    public int getId()
    {
        return id;
    }
    public String getLibelle()
    {
        return libelle;
    }
    public static int getNbreService()
    {
        return nbreService;
    }
    public Employe[] getTabEmploye()
    {
        return tabEmploye;
    }

    public void setId(int id)
    {
        this.id=id;
    }
    public void setLibelle(String libelle)
    {
        this.libelle=libelle;
    }
    public static void setNbreService(int nbreService)
    {
        Service.nbreService=nbreService;
    }
    public void setTabEmploye(Employe employe)
    {
        tabEmploye[nbreEmploy]=employe;
        nbreEmploy++;
        employe.setService(this);
    }

    @Override
    public String affiche()
    {
        return "Id: "+id+"\n Libelle: "+libelle;
    }
    public void compare()
    {

    }

}
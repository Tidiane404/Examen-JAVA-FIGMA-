public class UseCase
{
    private final int TAILLE=10;

    private int nbreService;
    private Service[] tabService= new Service[TAILLE];

    private Employe[] tabEmploye= new Employe[TAILLE];
    private int nbreEmploy;
   
    public void ajoutService(Service sr)
    {
        if(nbreService <TAILLE)
        {
            tabService[nbreService]=sr;
            nbreService++;
        }else
        {
            System.out.println("Non-Ajouté ");
        }
    }
    public void ajoutEmploye(Employe ep)
    {
        if(nbreEmploy<TAILLE)
        {
            tabEmploye[nbreEmploy]=ep;
            nbreEmploy++;
        }else
        {
            System.out.println("Non-Ajouté");
        }
    }

    public void listerService()
    {
        for(Service sr:tabService)
        {
            if(sr!=null)
                System.out.println(sr.affiche());
        }
    }

    
}
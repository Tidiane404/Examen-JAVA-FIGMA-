import java.util.Scanner;
public class Main
{
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int choix;
        UseCase useC=new UseCase();
        do {
            choix=menu();
            switch (choix) 
            {
                case 1:
                System.out.println("Entrez le libelle");
                String libelle=scanner.nextLine();
                Service serv=new Service();
                serv.setLibelle(libelle);
                useC.ajoutService(serv);
                    break;

                case 2:
                useC.listerService();
                    break;

                case 3:  
                System.out.println("Entrez le nom complet");
                String nomComplet=scanner.nextLine();
                System.out.println("Entrez la date d'mebauseChe");
                String dateEmbauseChe=scanner.nextLine();
                Employe ep=new Employe();
                ep.setnomComplet(nomComplet);
                ep.setDateEmbauche(dateEmbauseChe);
                useC.ajoutEmploye(ep);     
                    break;

                case 4:
                    break;
                    
                case 5: 
                    break;

                case 6:
                    System.out.println("Au revoir");
                    break;
                   
                default:
                    System.out.println("Veuillez faire un choix");
                    break;
            }

        }
        while(choix!=6);
    }

        public static int menu()
        {
            System.out.println("1-Ajouter un service"
                                +"\n2-lister Service"
                                +"\n3-Ajouter un employé"
                                +"\n4-Affecter un service à un employé"
                                +"\n5-Afficher les employés d'un service"
                                +"\n6-Quitter"
                                +"\nFaites votre choix: ");
            String choix;
            
            choix=scanner.nextLine();
            return Integer.parseInt(choix);
        }
        

    }
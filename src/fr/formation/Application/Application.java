package fr.formation.Application;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][][] Students = new String[][][] {{names},{groups},{status}};
		
		
		
	}
	
	
	
	/**
     * Ne rien modifier dans cette m�thode.
     */
    private static void runStaticStudentsExercise() {
	System.out.println("############# Static students #############");
	List<IStudent> students = createStaticStudentList();
	System.out.println("Step 1 & 2: " + students);
	double percentageOfInternals = calculateInternalPercentage(students);
	System.out.println("Step 3: internals=" + percentageOfInternals + "%");
	reverseStatus(students);
	System.out.println("Step 4: " + students);
	percentageOfInternals = calculateInternalPercentage(students);
	System.out.println("Step 5: internals=" + percentageOfInternals + "%");
	List<String> candidates = Arrays.asList("Aur�lien", "Jennifer",
		"Julien", "Bayrem");
	rotateStatic(students, candidates);
	System.out.println("Step 6: " + students);
    }

    /**
     * Ne rien modifier dans cette m�thode.
     */
    private static List<IStudent> createStaticStudentList() {
	String names = "Aur�lien,Pierre,Bayrem,Jennifer,H�l�ne,David,Julien";
	int[] groups = { 3, 1, 1, 2, 3, 2, 2 };
	boolean[] status = { false, true, true, false, true, false, true };
	return populateStudentList(names, groups, status);
    }

    /**
     * Construire une liste de student � partir des 3 tableaux en param�tres.
     * Ils contiennent les donn�es permettant de construire des student.
     * <p>
     * Les 3 tableaux ont la m�me longueur et fournissent les pr�noms, les
     * num�ros de groupe et les statuts (interne ou pas). Ainsi, par exemple,
     * Aur�lien est dans le groupe 3 et n'est pas interne, ou encore Julien est
     * dans le groupe 2 et est interne.
     * <p>
     * Pour construire des student il faut d'abord une classe concr�te Student
     * qui impl�mente IStudent, conforme aux conventions Javabeans. La m�thode
     * toString de la classe concr�te doit �tre red�fini pour l'affichage des 3
     * variables (nom, groupe, statut) dans la console.
     */
    
    
    
    
    
    private static List<IStudent> populateStudentList(String names,
	    int[] groups, boolean[] status) {
	// Implementer en 1 apres avoir �crit la classe student
	return null;
    }

    /**
     * Retourner le pourcentage de student qui ont le statut interne (internal =
     * true).
     */
    
    if (status = true) {
    	boolean i = true;
    	for (boolean i = true; i != false; i) {
    		return i / names.count;
    	}
    	
    }
    private static double calculateInternalPercentage(List<IStudent> students) {
	// Implementer en 2
	return 0.0;
    }

    /**
     * Modifier le statut de chaque student en l'inversant. Par exemple,
     * Aur�lien qui n'�tait pas interne (internal = false) sera pass� interne
     * (internal = true) apr�s l'appel � cette m�thode.
     */
    private static void reverseStatus(List<IStudent> students) {
	// Implementer en 3
    }

    /**
     * Change le groupe de certains student pass�s en param�tre. Il y a 1
     * student du groupe 1 et 1 du groupe 3, puis 2 student du groupe 2. Soit 4
     * student en tout.
     * <ul>
     * <li>Consid�rer qu'il y a forc�ment 3 groupes en tout (de 1 � 3)
     * <li>Consid�rer qu'il y a au moins 2 student dans chaque groupe
     * <li>Consid�rer que chaque student est unique par son nom (tous groupes
     * confondus)
     * <li>Faire la rotation (changement de groupe) uniquement pour les student
     * dont le pr�nom est pr�sent dans la list candidates
     * <li>Changer son groupe comme suit: si son groupe est 1 ou 3 alors il
     * passe en 2, si son groupe est 2 il doit y en avoir un qui passe en 1 et
     * l'autre en 3
     * <li>Au final, le nombre de student par groupe n'a pas chang�
     * </ul>
     */
    private static void rotateStatic(List<IStudent> students,
	    List<String> candidates) {
	// Implementer en 4
    }

    /**
     * Ne rien modifier dans cette m�thode.
     */
    private static void runDynamicStudentsExercise() {
	System.out.println("\n############# Dynamic students #############");
	List<IStudent> students = createDynamicStudentList();
	System.out.println("Step 7: " + students);
	rotateDynamic(students);
	System.out.println("Step 8: " + students);
    }

    /**
     * Ne rien modifier dans cette m�thode sauf a des fins de tests en veillant
     * � ce que tous les tableaux aient le m�me nombre d'�l�ments, que les
     * groupes se suivent etc.
     * <p>
     * Les tests � effectuer:
     * <ul>
     * <li>1 seul groupe
     * <li>2 groupes
     * <li>3 ou + groupes (cas impl�menter par d�faut dans la m�thode)
     * </ul>
     */
    private static List<IStudent> createDynamicStudentList() {
	String names = "Aur�lien,Pierre,Bayrem,Jennifer,Aur�lien,David,Julien,Imen,Guillaume,Safa";
	int[] groups = { 3, 1, 1, 2, 3, 2, 2, 4, 4, 2 };
	boolean[] status = { false, true, true, false, true, false, true, false,
		false, false };
	return populateStudentList(names, groups, status);
    }

    /**
     * Op�re une rotation en se basant sur tous les students en param�tres.
     * <ul>
     * <li>Consid�rer qu'il y a au moins 1 groupe, g�rer donc les cas o� il y a
     * 1 groupe, 2 groupes ou bien n groupes avec des groupes interm�diaires
     * <li>Consid�rer qu'il y a au moins 2 student dans chaque groupe
     * <li>Consid�rer que les num�ros de groupes se suivent (de 1 � n)
     * <li>Consid�rer qu'il n'y a pas d'unicit� de nom du student (�a n'est pas
     * un crit�re)
     * <li>Changer de groupe comme suit: un student doit passer du groupe 1 au
     * suivant s'il existe, 1 student doit passer du dernier groupe au pr�c�dent
     * s'il existe, 2 students doivent changer de groupe dans chaque groupe
     * interm�diaire (1 dans le pr�c�dent, l'autre dans le suivant)
     * <li>Au final, le nombre de student par groupe n'a pas chang�
     * </ul>
     */
    private static void rotateDynamic(List<IStudent> students) {
	// Implementer en 5 (tr�s optionel)
    }
	

}
package fr.formation.Application;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][][] Students = new String[][][] {{names},{groups},{status}};
		
		
		
	}
	
	
	
	/**
     * Ne rien modifier dans cette méthode.
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
	List<String> candidates = Arrays.asList("Aurélien", "Jennifer",
		"Julien", "Bayrem");
	rotateStatic(students, candidates);
	System.out.println("Step 6: " + students);
    }

    /**
     * Ne rien modifier dans cette méthode.
     */
    private static List<IStudent> createStaticStudentList() {
	String names = "Aurélien,Pierre,Bayrem,Jennifer,Hélène,David,Julien";
	int[] groups = { 3, 1, 1, 2, 3, 2, 2 };
	boolean[] status = { false, true, true, false, true, false, true };
	return populateStudentList(names, groups, status);
    }

    /**
     * Construire une liste de student à partir des 3 tableaux en paramètres.
     * Ils contiennent les données permettant de construire des student.
     * <p>
     * Les 3 tableaux ont la même longueur et fournissent les prénoms, les
     * numéros de groupe et les statuts (interne ou pas). Ainsi, par exemple,
     * Aurélien est dans le groupe 3 et n'est pas interne, ou encore Julien est
     * dans le groupe 2 et est interne.
     * <p>
     * Pour construire des student il faut d'abord une classe concrète Student
     * qui implémente IStudent, conforme aux conventions Javabeans. La méthode
     * toString de la classe concrète doit être redéfini pour l'affichage des 3
     * variables (nom, groupe, statut) dans la console.
     */
    
    
    
    
    
    private static List<IStudent> populateStudentList(String names,
	    int[] groups, boolean[] status) {
	// Implementer en 1 apres avoir écrit la classe student
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
     * Aurélien qui n'était pas interne (internal = false) sera passé interne
     * (internal = true) après l'appel à cette méthode.
     */
    private static void reverseStatus(List<IStudent> students) {
	// Implementer en 3
    }

    /**
     * Change le groupe de certains student passés en paramètre. Il y a 1
     * student du groupe 1 et 1 du groupe 3, puis 2 student du groupe 2. Soit 4
     * student en tout.
     * <ul>
     * <li>Considérer qu'il y a forcément 3 groupes en tout (de 1 à 3)
     * <li>Considérer qu'il y a au moins 2 student dans chaque groupe
     * <li>Considérer que chaque student est unique par son nom (tous groupes
     * confondus)
     * <li>Faire la rotation (changement de groupe) uniquement pour les student
     * dont le prénom est présent dans la list candidates
     * <li>Changer son groupe comme suit: si son groupe est 1 ou 3 alors il
     * passe en 2, si son groupe est 2 il doit y en avoir un qui passe en 1 et
     * l'autre en 3
     * <li>Au final, le nombre de student par groupe n'a pas changé
     * </ul>
     */
    private static void rotateStatic(List<IStudent> students,
	    List<String> candidates) {
	// Implementer en 4
    }

    /**
     * Ne rien modifier dans cette méthode.
     */
    private static void runDynamicStudentsExercise() {
	System.out.println("\n############# Dynamic students #############");
	List<IStudent> students = createDynamicStudentList();
	System.out.println("Step 7: " + students);
	rotateDynamic(students);
	System.out.println("Step 8: " + students);
    }

    /**
     * Ne rien modifier dans cette méthode sauf a des fins de tests en veillant
     * à ce que tous les tableaux aient le même nombre d'éléments, que les
     * groupes se suivent etc.
     * <p>
     * Les tests à effectuer:
     * <ul>
     * <li>1 seul groupe
     * <li>2 groupes
     * <li>3 ou + groupes (cas implémenter par défaut dans la méthode)
     * </ul>
     */
    private static List<IStudent> createDynamicStudentList() {
	String names = "Aurélien,Pierre,Bayrem,Jennifer,Aurélien,David,Julien,Imen,Guillaume,Safa";
	int[] groups = { 3, 1, 1, 2, 3, 2, 2, 4, 4, 2 };
	boolean[] status = { false, true, true, false, true, false, true, false,
		false, false };
	return populateStudentList(names, groups, status);
    }

    /**
     * Opère une rotation en se basant sur tous les students en paramètres.
     * <ul>
     * <li>Considérer qu'il y a au moins 1 groupe, gérer donc les cas où il y a
     * 1 groupe, 2 groupes ou bien n groupes avec des groupes intermédiaires
     * <li>Considérer qu'il y a au moins 2 student dans chaque groupe
     * <li>Considérer que les numéros de groupes se suivent (de 1 à n)
     * <li>Considérer qu'il n'y a pas d'unicité de nom du student (ça n'est pas
     * un critère)
     * <li>Changer de groupe comme suit: un student doit passer du groupe 1 au
     * suivant s'il existe, 1 student doit passer du dernier groupe au précédent
     * s'il existe, 2 students doivent changer de groupe dans chaque groupe
     * intermédiaire (1 dans le précédent, l'autre dans le suivant)
     * <li>Au final, le nombre de student par groupe n'a pas changé
     * </ul>
     */
    private static void rotateDynamic(List<IStudent> students) {
	// Implementer en 5 (très optionel)
    }
	

}
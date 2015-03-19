/**
 * @author combear
 * featuring Charlotte
 */
public class PileEntiersPositifsOuNuls
{

	public static final int CAPACITE_DEFAUT=4;
	public static final int PILE_PLEINE=1;
	public static final int PILE_VIDE=0;
	public static final int EMPILER_OK=2;
	public static final int DEPILER_OK=3;
	/**
	 * ensemble contenant les élements de la pile
	 */
	private int[] elements;
	/**
	 * nombre d'élement total que la pile peut contenir
	 */
	private int capacite ;
	/**
	 * nombre d'élement courant de la pile
	 */
	private int taille;
	
	/**
	 * créer une nouvelle pile de capacité <tt>CAPACITE_DEFAUT</tt>
	 * elle est initialement vide
	 */
	public PileEntiersPositifsOuNuls()
	{
		this.capacite=CAPACITE_DEFAUT;
		this.taille=0;
		this.elements=new int[CAPACITE_DEFAUT];
			
	}
	
	/**
	 * créer une nouvelle pile de capacité capaciteEntree et initialement vide
	 * @param capaciteEntree capacité de la pile créée
	 */
	public PileEntiersPositifsOuNuls(int capaciteEntree)
	{
		if(capaciteEntree>0)
		{
		this.capacite=capaciteEntree;
		this.taille=0;
		this.elements=new int[capaciteEntree];
		}
	}
	
	/**
	 * obtenir la capacité de la pile
	 * @return la capacité de la pile
	 */
	public int getCapacite()
	{
		return this.capacite;
	}
	/**
	 * obtenir la taille de la pile
	 * @return la taille de la pile
	 */
	public int getTaille()
	{
		return this.taille;
	}
	
	/**
	 * Ajoute à la pile actuel l'élement passé en paramètre
	 * @param elementEmpile element à empiler 
	 * @return si empilement s'est bien passé ou non
	 */
	public int empiler(int elementEmpile)
	{
		if(this.capacite==this.taille)
		{
			return PILE_PLEINE;
			
		}
		this.elements[taille]=elementEmpile;
		this.taille++;
		return EMPILER_OK;
		
	}
	/**
	 * Enlève l'élement du sommet de la pile 
	 * @return l'élément dépilé s'il existe
	 */
	
	public int depiler()
	{
		if(this.taille==0)
		{
			return PILE_VIDE;
		}
		this.taille--;
		return elements[taille+1];
		
	}
	
	
	
}



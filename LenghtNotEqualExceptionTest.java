package VecteurHelperTest;

import static org.junit.Assert.*;

import VecteurHelper.LenghtNotEqualException;
import VecteurHelper.VecteurHelper; 

import org.junit.Test;

import VecteurHelper.VecteurHelper;
import static junit.framework.TestCase.fail;


public class LenghtNotEqualExceptionTest
/*Test de l'exception d�clench�e lorsque deux tableaux n'ont pas la m�me taille*/

{
	@Test
	public void testLenghtNotEqualException() 
	/*Test du constructeur de la classe LenghtNotEqualException*/
	{
		try
		{
			VecteurHelper a = new VecteurHelper();
			int[] table1 = {1,2,3};
			int[] table2 = {1,2};
			a.sommeVect(table1, table2);
			fail();
			
		}
		catch(LenghtNotEqualException e)
		{
			assert(e.getMessage().contains("La taille des deux vecteurs n'est pas identique !"));
		}
	}

}
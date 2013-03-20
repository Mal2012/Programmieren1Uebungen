package uebungen2;

public class Blöcke {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		{// A
			int x = 5, y = 5;
			{// B
				float f = 13.0f, g = 13.0f;
				x = 20;
				int z = 30;
				float h = 14.0f;
				{// C

				}
				y = 3000;
			}// h und z gelten nur bis hier
			float h = 5.0f; // h=5.0f;
			float z = 4.0f; // z=4.0f;
		}

	}

}

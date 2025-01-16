package dat102.f02.tabellbag;

/**
 * En implementasjon av BagADT
 * 
 * @author Lars-Petter Helland
 */
public class TabellBag<T> implements BagADT<T> {

	private static final int DEFAULT_KAPASITET = 10;

	private T[] tabell;
	private int antall;

	/************************************************************/

	public TabellBag() {
		this(DEFAULT_KAPASITET);
	}

	@SuppressWarnings("unchecked")
	public TabellBag(int kapasitet) {
		tabell = (T[]) new Object[kapasitet];
		antall = 0;
	}

	@Override
	public int getCurrentSize() {
		return antall;
	}

	@Override
	public boolean isEmpty() {
		return antall == 0;
	}

	private boolean erFull() {
		return antall == tabell.length;
	}
	
	@Override
	public boolean add(T newEntry) {
		
		if (erFull()) {
			return false;
		}
		
		tabell[antall] = newEntry;
		antall++;
		return true;
	}

	@Override
	public T remove() {
		
		if (isEmpty()) {
			return null;
		}
		
		T element = tabell[antall-1];
		tabell[antall-1] = null;
		antall--;
		return element;
	}

	@Override
	public boolean remove(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(T anEntry) {
		
		for (int i = 0; i < antall; i++) {
			if (tabell[i].equals(anEntry)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	/************************************************************/

}

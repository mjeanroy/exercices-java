package exercices.multimap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public interface MultiMap<K,V> extends Iterable<V> {
	int size();
	Set<V> get(Object key);
	boolean put(K key, V value);
	
	public static enum Kind{
		UNSORTED {

			@Override
			public <K, V> Map<K, V> create() {
				return new HashMap<>();
			}
		},
		SORT_BY_KEY {

			@Override
			public <K, V> Map<K, V> create() {
				return new TreeMap<>();
			}
		},
		SORT_BY_INSERTION_ORDER {

			@Override
			public <K, V> Map<K, V> create() {
				return new LinkedHashMap<>();
			}
		};

		public abstract <K, V> Map<K, V> create(); // Paterne Stratégie !!
	}
	
	
}

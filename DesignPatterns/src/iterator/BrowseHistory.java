package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

	List<String> urls = new ArrayList<String>();

	public void Push(String url) {
		urls.add(url);
	}

	@SuppressWarnings("unused")
	private String pop() {
		int size = urls.size() - 1;
		String lastUrl = urls.get(size);
		urls.remove(size);
		return lastUrl;
	}

	public List<String> getUrls() {
		return urls;
	}

	public ListIterator createIterator() {
		return new ListIterator(this);
	}

	public class ListIterator implements Iterator {

		BrowseHistory history;
		int index;

		public ListIterator(BrowseHistory history) {
			this.history = history;
		}

		public boolean hasNext() {
			return (index < history.urls.size());
		}

		public String current() {
			return history.urls.get(index);
		}

		public void next() {
			index++;
		}

	}

}

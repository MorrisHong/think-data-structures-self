

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * @author downey
 *
 */
public class ListClientExampleTest {

	/**
	 * Test method for {@link ListClientExample}.
	 */
	@Test
	public void testListClientExample() {
		ListClientExample expectedArrayList = new ListClientExample(new ArrayList());
		ListClientExample expectedLinkedList = new ListClientExample(new LinkedList());
		@SuppressWarnings("rawtypes")
		List list = expectedArrayList.getList();
		assertThat(list).isInstanceOf(ArrayList.class);
		assertThat(list).isNotInstanceOf(LinkedList.class);


		list = expectedLinkedList.getList();
		assertThat(list).isInstanceOf(LinkedList.class);
		assertThat(list).isNotInstanceOf(ArrayList.class);
	}

}

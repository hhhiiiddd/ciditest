package jp.co.deliv.cicd;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Sample1Test {

	@Test
	public void testCalclate() {
		Sample1 s1 = new Sample1();
		int ret = s1.calclate(10, 5);
		assertThat(ret).isEqualTo(5);
	}

}

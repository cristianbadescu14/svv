package mock;


import static org.mockito.Mockito.*;

import config.Config;
import exceptions.InvalidPortNumberException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MockTest {

	 private Config mockConfig = mock(Config.class);

		@Test
		public void setChangePort() throws InvalidPortNumberException {
			mockConfig.setPortNumber(80);
			when(mockConfig.getPort()).thenReturn(80);
			assertEquals(80, mockConfig.getPort());
		}
		
		@Test
		public void setChangePort2() throws InvalidPortNumberException {
			mockConfig.setPortNumber(80);
			assertEquals(0, mockConfig.getPort());
		}

	
	
}

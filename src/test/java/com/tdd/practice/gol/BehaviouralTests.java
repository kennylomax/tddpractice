package com.tdd.practice.gol;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

/** 
 To run:
 mvn test 
 or
 java -jar junit-platform-console-standalone-1.8.0-M1.jar -cp target/test-classes -cp target/classes --scan-classpath
*/
 public class BehaviouralTests {
	@Order(1)    
    @ParameterizedTest(name = "A fresh GOL board of size {0} should look like {1}")
	@CsvSource({
        "1, '0\n'",
        "2, '0-0\n0-0\n'",
        "3, '0-0-0\n0-0-0\n0-0-0\n'",
		}
	)
	@Disabled("Not yet implemented")
    public void testFreshGOLBoards( int edge, String board){    
    }

	@Order(2)    
    @ParameterizedTest(name = "Populating a GOL board of size {0} with \"{1}\" should look like {2}")
	@CsvSource({
        "1, 0, 				'0\n'",
        "2, 0110, 			'0-1\n1-0\n'",
        "3, 101 010 101,	'1-0-1\n0-1-0\n1-0-1\n'",
        "3, - 010 -,		'0-0-0\n0-1-0\n0-0-0\n'",    }
	)
	@Disabled("Not yet implemented")
	void testPopulatingGOLBoards(int edge, String cells, String board){
    }

    @Order(3)    
    @ParameterizedTest(name = "A GOL board with {0} should evolve to {1}")
	@CsvSource({
		"0000000100001000010000000, '0-0-0-0-0\n0-0-0-0-0\n0-1-1-1-0\n0-0-0-0-0\n0-0-0-0-0\n'",
		}
	)
	@Disabled("Not yet implemented")
	void testGOLEvolution(String cells, String board){
	}   

}

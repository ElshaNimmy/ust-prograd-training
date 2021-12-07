import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AreaofRectangleTest {
    public Rectangle area;
    @Nested
    class TestingAreaFunction{
        @BeforeEach
        public  void setArea(){
            area =new Rectangle();
        }
        @Test
        public void areaofLengthEightandBreadthThreeIsTwentyFour(){
            double ans =area.area(8,3);
            double expected =24;
            assertEquals(ans,expected);
            }
            @Test
        public void areaofLengthofFiveandBreadthThreeIsFifteen() {
                double ans = area.area(5, 3);
                double expected = 15;
                assertEquals(ans, expected);
            }
        }
        }
    }


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AreaofRectangleTest {
    public Rectangle area;
    public Rectangle perimeter;
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
        @Nested
        class TestingPerimeterFunction{
            @BeforeEach
            public  void setPerimeter(){

                perimeter =new Rectangle();
            }
            @Test
            public void perimeterofLengthEightandBreadthThreeIsTwentyTwo(){
                double ans =perimeter.perimeter(8,3);
                double expected =22;
                assertEquals(ans,expected);
            }
            @Test
            public void perimeterofLengthofFiveandBreadthThreeIsSixteen() {
                double ans = perimeter.perimeter(5, 3);
                double expected = 16;
                assertEquals(ans, expected);
            }

        }
    }


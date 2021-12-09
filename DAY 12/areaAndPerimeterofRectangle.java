import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AreaOfRectangleTest {
    @Nested
    class TestingAreaFunction{

        @Test
        public void areaOfLengthTenAndBreadthFiveIsFifty(){
            Rectangle rectangle = new Rectangle(10,5);
            double actualArea = rectangle.area();
            double expectedArea = 50;
            Assertions.assertEquals(expectedArea,actualArea);
        }
        @Test
        public void throwExceptionWhenMeasurementsBecomeNegativeOrZero(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2,-4);

            };
        }
        @Test
        public void areaOfLengthEightAndBreadthThreeIsTwentyFour(){
            Rectangle rectangle = new Rectangle(8,3);
            double actualArea = rectangle.area();
            double expectedArea = 24;
            Assertions.assertEquals(expectedArea,actualArea);
        }

        @Test
        public void verifyAreaForDecimalMeasurements(){
            Rectangle rectangle = new Rectangle(6.5,5);
            double actualArea = rectangle.area();
            double expectedArea= 32.5;
            Assertions.assertEquals(expectedArea,actualArea);
        }
    }

    @Nested
    class TestingPerimeterFunction{

        @Test
        public void perimeterOfLengthTenAndBreadthFiveIsThirty(){
            Rectangle rectangle = new Rectangle(10,5);
            double actualArea= rectangle.perimeter();
            double expectedArea = 30;
            Assertions.assertEquals(expectedArea,actualArea);
        }
        @Test
        public void verifyPerimeterForDecimalMeasurements(){
            Rectangle ar = new Rectangle(5.4,3.2);
            double actualPerimeter = ar.perimeter();
            double expectedPerimeter = 17.2;
            Assertions.assertEquals(expectedPerimeter,actualPerimeter);
        }
        @Test
        public void throwExceptionWhenMeasurementsBecomeNegativeOrZero(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2,-4);

        }



    }

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitConverterTest {
    UnitConverter unitConverter = new UnitConverter();

    @Nested
    class CentimeterToCentimeterTest {
        @Test
        public void checkIfOneCentimeterEqualToOneCentimeter() {
            double actualMagnitude = unitConverter.centimeterToCentimeter(1);
            double expectedMagnitude = 1;
            assertEquals(expectedMagnitude, actualMagnitude);

        }

        @Test
        public void checkIfOnePointFiveCentimeterEqualToOnePointFiveCentimeter() {
            double actualMagnitude = unitConverter.centimeterToCentimeter(1.5);
            double expectedMagnitude = 1.5;
            assertEquals(expectedMagnitude, actualMagnitude);
        }

    }

    @Nested
    class MeterToCentimeterTest {
        @Test
        public void checkIfOneMeterEqualToHundredCentimeter() {
            double actualMagnitude = unitConverter.meterToCentimeter(1);
            double expectedMagnitude = 100;
            assertEquals(expectedMagnitude, actualMagnitude);
        }

        @Test
        public void checkIfOnePointFiveMeterEqualToOneHundredFiftyCentimeter() {
            double actualMagnitude = unitConverter.meterToCentimeter(1.5);
            double expectedMagnitude = 150;
            assertEquals(expectedMagnitude, actualMagnitude);
        }


    }

    @Nested
    class CentimeterToKilometerTest {
        @Test
        public void checkIfHundredCentimeterEqualToPointZeroZeroOneKilometer() {
            double actualMagnitude = unitConverter.centimeterToKilometer(100);
            double expectedMagnitude = 0.001;
            assertEquals(expectedMagnitude, actualMagnitude);
        }

        @Test
        public void checkIfOneHundredFiftyCentimeterEqualToPointZeroZeroOneFiveKilometer() {
            double actualMagnitude = unitConverter.centimeterToKilometer(150);
            double expectedMagnitude = 0.0015;
            assertEquals(expectedMagnitude, actualMagnitude);
        }

    }

    @Nested
    class AdditionOfMagnitudes {

        @Test
        public void checkIfAdditionOfOneMeterAndHundredCentimeterGivesTwoMeters() {
            double actualMagnitude = 1+ unitConverter.centimeterToMeter( 100);
            double expectedMagnitude = 2;
            assertEquals(expectedMagnitude, actualMagnitude);
        }

        @Test
        public void checkIfAdditionOfTwoHundredCentimetersAndOneKilometersGivesOneLakhAndTwoHundredCentimeters() {
           // double actualMagnitude = unitConverter.addingCentimeterAndKilometerGivesCentimeter(200, 1);
            double actualMagnitude = 200 + unitConverter.kilometerToCentimeter( 1);
            double expectedMagnitude = 100200;
            assertEquals(expectedMagnitude, actualMagnitude);

        }
    }

    @Nested
    class SubtractionOfMagnitudes {

        @Test
        public void checkIfSubtractionOfOneMeterAndFiftyCentimeterGivesPointFiveMeters() {
            double actualMagnitude = 1 + unitConverter.centimeterToMeter(50);
            double expectedMagnitude = 0.5;
            assertEquals(expectedMagnitude, actualMagnitude);
        }

        @Test
        public void checkIfSubtractionOfTwoThousandCentimeterAndOneMeterGivesNineteenHundredCentimeters() {
            double actualMagnitude = 2000 + unitConverter.meterToCentimeter( 1);
            double expectedMagnitude = 1900;
            assertEquals(expectedMagnitude, actualMagnitude);
        }
    }

}
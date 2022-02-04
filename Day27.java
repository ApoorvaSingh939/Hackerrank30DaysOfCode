//TestDataUniqueValues.get_array() returns an array of at least two elements with all unique values, so for example [1,2] is sufficient, 
//and then, TestDataUniqueValues.get_expected_result() returns 0 as the index of minimum value in this array TestDataExactlyTwoDifferentMinimums.get_array() 
//returns an array with at exactly two different elements with minimum value, so for example [2,1,1] is fine, and then TestDataExactlyTwoDifferentMinimums.get_expected_result()
//returns 1 as the index of first of these minima because it is the expected result according to the statement.
static class TestDataEmptyArray {
        public static int[] get_array() {
            // complete this function
            return new int[]{};
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            // complete this function
            return new int[]{1,2,3,4,5};
        }

        public static int get_expected_result() {
            // complete this function
            return minimum_index(get_array());
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            // complete this function
            return new int[]{1,2,3,4,3,2,1};
        }

        public static int get_expected_result() {
            // complete this function
            return minimum_index(get_array());
        }
    }

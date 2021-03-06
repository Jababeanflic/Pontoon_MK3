/**
 * Pontoon_MK3
 * Enum list of face names for standard deck
 * @author 18025316
 * Scott Kinsmnan
 * 30/10/2020
 */

public enum FaceNames {
    two(2),
    three(3),
    four(4),
    five(5),
    six(6),
    seven(7),
    eight(8),
    nine(9),
    ten(10),
    jack(10),
    queen(10),
    king(10),
    ace(11);

    private int value;

    FaceNames(int valueCard) {
        value = valueCard;
    }

    public int getValue() {
        return value;
    }
}

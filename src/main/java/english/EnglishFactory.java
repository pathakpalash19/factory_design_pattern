package english;

public class EnglishFactory {

    public static EnglishBook getEnglishBookInstance(EnglishDepth depth) {
        switch (depth) {
            case LOW : return new PreliminaryEnglish();
            case MEDIUM : return new MediumEnglish();
            case HIGH : return new HighEndEnglish();
        }
        return null;
    }
}
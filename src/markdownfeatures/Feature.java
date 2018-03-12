package markdownfeatures;

import conversion.ConversionVisitor;

public interface Feature {

    boolean detect(String input);

    void set(String input);

    void convert(ConversionVisitor conversionVisitor);

}
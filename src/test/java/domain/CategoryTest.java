package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CategoryTest {
    @ParameterizedTest
    @CsvSource(value= {"CHICKEN,치킨", "BEVERAGE,음료"})
    void CategoryNameTest(Category category, String expected) {
        assertThat(category.toString()).isEqualTo("["+expected+"]");
    }
}

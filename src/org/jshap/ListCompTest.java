package org.jshap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ListCompTest {
    // Проверка на проброс ошибки при некорректных параметрах конструктора
    @Test
    void testListCompWithParametersException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ListComp(2000, 4000);
        });
    }
}

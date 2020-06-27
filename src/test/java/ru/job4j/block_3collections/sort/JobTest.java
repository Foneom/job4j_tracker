package ru.job4j.block_3collections.sort;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    /**
     * Тест комбинированного компаратора по убыванию имени и приоритета
     */
    @Test
    public void whenComparatorDescByNameAndPriority() {
    Comparator<Job> cmpDescNamePriority = new JobDescByName()
            .thenComparing(new JobDescByPriority());
    int rsl = cmpDescNamePriority.compare(
            new Job("Impl task", 0),
            new Job("Fix bug", 1)
    );
    assertThat(rsl, lessThan(0));
}
    /**
     * Тест комбинированного компаратора по убыванию приоритета и имени
     */
    @Test
    public void whenComparatorDescByPriorityAndName() {
        Comparator<Job> cmpDescNamePriority = new JobDescByPriority()
                .thenComparing(new JobDescByName());
        int rsl = cmpDescNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
    /**
     * Тест комбинированного компаратора по возрастанию имени и приоритета
     */
    @Test
    public void whenComparatorIncreaseByNameAndPriority() {
        Comparator<Job> cmpIncreaseNamePriority = new JobIncreaseByName()
                .thenComparing(new JobIncreaseByPriority());
        int rsl = cmpIncreaseNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
    /**
     * Тест комбинированного компаратора по возрастанию приоритета и имени
     */
    @Test
    public void whenComparatorIncreaseByPriorityAndName() {
        Comparator<Job> cmpIncreaseNamePriority = new JobIncreaseByPriority()
                .thenComparing(new JobIncreaseByName());
        int rsl = cmpIncreaseNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
    /**
     * По имени и по убыванию
     */
    @Test
public void whenComparatorDescByName() {
    Comparator<Job> cmpDescName = new JobDescByName();
    int rsl = cmpDescName.compare(
            new Job("Impl task", 0),
            new Job("1 bug", 1)
    );
    assertThat(rsl, lessThan(0));
}
    /**
     * По приоритету и по убыванию
     */
    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int rsl = cmpDescPriority.compare(
                new Job("Impl task", 0),
                new Job("0 bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
    /**
     * По имени и по возрастанию
     */
    @Test
    public void whenComparatorIncreaseByName() {
    Comparator<Job> cmpIncreaseName = new JobIncreaseByName();
    int rsl = cmpIncreaseName.compare(
            new Job("Impl task", 0),
            new Job("0 bug", 1)
    );
        assertThat(rsl, greaterThan(0));
    }
    /**
     * По приооритету и возрастанию
     */
    @Test
    public void whenComparatorIncreaseByPriority() {
        Comparator<Job> cmpIncreasePriority = new JobIncreaseByPriority();
        int rsl = cmpIncreasePriority.compare(
                new Job("Impl task", 0),
                new Job("0 bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

}
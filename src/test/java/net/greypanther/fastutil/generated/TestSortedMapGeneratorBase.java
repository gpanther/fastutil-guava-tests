package net.greypanther.fastutil.generated;

import java.util.AbstractMap;
import java.util.Map;

import com.google.common.collect.testing.TestSortedMapGenerator;

abstract class TestSortedMapGeneratorBase<K extends Comparable<? super K>, V>
    extends TestMapGeneratorBase<K, V>implements TestSortedMapGenerator<K, V> {
  private final Map.Entry<K, V> belowSamplesLesser, belowSamplesGreater, aboveSamplesLesser,
      aboveSamplesGreater;

  protected TestSortedMapGeneratorBase(Class<K> clazzK, Class<V> clazzV, K[] keySampleElements,
      V[] valueSampleElements, Ordering ordering) {
    super(clazzK, clazzV, TestSampleValues.createSampleElementsForSorted(keySampleElements),
        TestSampleValues.createSampleElementsForSorted(valueSampleElements), ordering);

    this.belowSamplesLesser =
        new AbstractMap.SimpleEntry<K, V>(keySampleElements[0], valueSampleElements[0]);
    this.belowSamplesGreater =
        new AbstractMap.SimpleEntry<K, V>(keySampleElements[1], valueSampleElements[1]);
    this.aboveSamplesLesser =
        new AbstractMap.SimpleEntry<K, V>(keySampleElements[7], valueSampleElements[7]);
    this.aboveSamplesGreater =
        new AbstractMap.SimpleEntry<K, V>(keySampleElements[8], valueSampleElements[8]);
  }

  @Override
  public Map.Entry<K, V> belowSamplesLesser() {
    return belowSamplesLesser;
  }

  @Override
  public Map.Entry<K, V> belowSamplesGreater() {
    return belowSamplesGreater;
  }

  @Override
  public Map.Entry<K, V> aboveSamplesLesser() {
    return aboveSamplesLesser;
  }

  @Override
  public Map.Entry<K, V> aboveSamplesGreater() {
    return aboveSamplesGreater;
  }
}

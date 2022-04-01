package com.example.demo;

import java.util.function.BiFunction;
import java.util.function.Function;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ItemType {

  AA("생수",CalRatio::getRatio,CalRatio::getTotalAccount),
  BB("음료",CalRatio::getRatio,CalRatio::getTotalAccount),
  CC("과자",CalRatio::getRatio,CalRatio::getTotalAccount);

  final String type;
  final Function<Long,Integer> ratio;
  final BiFunction<Integer,Integer,Integer> totalAccount;
}

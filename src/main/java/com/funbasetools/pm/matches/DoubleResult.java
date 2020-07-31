package com.funbasetools.pm.matches;

import com.funbasetools.pm.statements.MatchStatement;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public interface DoubleResult<A, B, R> {

    MatchStatement<R> then(final BiFunction<A, B, R> f);

    DoubleResult<A, B, R> and(final BiPredicate<A, B> p);
}

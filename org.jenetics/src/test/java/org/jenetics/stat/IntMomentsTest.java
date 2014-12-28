/*
 * Java Genetic Algorithm Library (@__identifier__@).
 * Copyright (c) @__year__@ Franz Wilhelmstötter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author:
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmx.at)
 */
package org.jenetics.stat;

import java.util.Random;

import org.jenetics.util.Factory;
import org.jenetics.util.ObjectTester;
import org.jenetics.util.RandomRegistry;

/**
 * @author <a href="mailto:franz.wilhelmstoetter@gmx.at">Franz Wilhelmstötter</a>
 * @version <em>$Date: 2014-09-19 $</em>
 */
public class IntMomentsTest extends ObjectTester<IntMoments> {

	@Override
	protected Factory<IntMoments> factory() {
		return () -> {
			final Random random = RandomRegistry.getRandom();
			return IntMoments.of(
				random.nextLong(),
				random.nextInt(),
				random.nextInt(),
				random.nextLong(),
				random.nextDouble(),
				random.nextDouble(),
				random.nextDouble(),
				random.nextDouble()
			);
		};
	}

}

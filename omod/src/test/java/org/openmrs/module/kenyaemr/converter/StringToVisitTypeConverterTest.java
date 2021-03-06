/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.converter;

import org.junit.Assert;
import org.junit.Test;
import org.openmrs.api.context.Context;
import org.openmrs.web.test.BaseModuleWebContextSensitiveTest;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

/**
 * Tests for {@link StringToVisitTypeConverter}
 */
public class StringToVisitTypeConverterTest extends BaseModuleWebContextSensitiveTest {

	private StringToVisitTypeConverter converter = new StringToVisitTypeConverter();

	/**
	 * @see StringToVisitConverter#convert(String)
	 */
	@Test
	public void convert_shouldConvertString() {
		Assert.assertThat(converter.convert(null), nullValue());
		Assert.assertThat(converter.convert(""), nullValue());
		Assert.assertThat(converter.convert("1"), is(Context.getVisitService().getVisitType(1)));
	}
}
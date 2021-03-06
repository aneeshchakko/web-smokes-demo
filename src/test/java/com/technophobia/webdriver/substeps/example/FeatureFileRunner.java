/*
 *	Copyright Technophobia Ltd 2012
 *
 *   This file is part of Substeps.
 *
 *    Substeps is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    Substeps is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with Substeps.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.technophobia.webdriver.substeps.example;

import com.technophobia.substeps.runner.JunitFeatureRunner;
import org.junit.runner.RunWith;

import com.technophobia.webdriver.substeps.impl.BaseWebdriverSubStepImplementations;
import com.technophobia.webdriver.substeps.runner.DefaultExecutionSetupTearDown;

/**
 * A class which can be run as a junit test inside an IDE.  Useful for writing debugging tests.  
 * Use the maven runner plugin for continuous integration as that provides better reporting.
 * 
 * @author imoore
 */
@JunitFeatureRunner.SubStepsConfiguration(featureFile = "./target/test-classes/features",
subStepsFile = "./target/test-classes/substeps", 
stepImplementations = { BaseWebdriverSubStepImplementations.class, ExampleCustomWebdriverStepImplementations.class },
beforeAndAfterImplementations = { ExampleSetupAndTearDown.class },
tagList = "@all")

@RunWith(JunitFeatureRunner.class)
public class FeatureFileRunner {
    // no op
}

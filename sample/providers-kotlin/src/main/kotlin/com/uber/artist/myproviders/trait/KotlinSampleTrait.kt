/*
 * Copyright (C) 2018. Uber Technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.uber.artist.myproviders.trait

import com.google.auto.service.AutoService
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec
import com.uber.artist.api.KotlinTrait
import com.uber.artist.myproviders.KotlinSampleTypeNames

/**
 * A somewhat arbitrary example of a custom Trait.
 */
@AutoService(KotlinTrait::class)
class KotlinSampleTrait : KotlinTrait {

  override fun generateFor(type: TypeSpec.Builder, initMethod: FunSpec.Builder, rClass: ClassName, sourceType: String) {
    type.addFunction(FunSpec.builder("sampleMethodFromCustomTrait")
        .addModifiers(KModifier.PUBLIC)
        .returns(KotlinSampleTypeNames.VIEW)
        .addStatement("return this")
        .build())
  }
}

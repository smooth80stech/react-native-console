// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.github.beansoftapp.reatnative.idea.sh;

import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public abstract class ShRunner {
  protected final Project myProject;

  public ShRunner(@NotNull Project project) {
    myProject = project;
  }

  public abstract void run(@NotNull String command, @NotNull String workingDirectory);

  public abstract boolean isAvailable(@NotNull Project project);
}

/**
Copyright 2015 Osiris Project Team

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/   

package com.fhc25.percepcion.osiris.mapviewer.ui.views.indoor.level;

import java.util.Collection;

public interface IFloorSelectorView {

    void addObserver(IFloorSelectorObserver observer);

    void removeObserver(IFloorSelectorObserver observer);

    boolean isVisible();

    void setVisible(boolean visible);

    void setFloor(String floor);

    String getFloor();

    public void load(Collection<String> names);
}

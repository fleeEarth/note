package com.myapp.note.common;

import com.myapp.note.slice.AddAbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.DragInfo;
import ohos.agp.components.element.ShapeElement;
import ohos.app.Context;

public class CreateComponent {





    public void setDraggedListener(Component component){

        component.setDraggedListener(Component.DRAG_HORIZONTAL_VERTICAL, new Component.DraggedListener() {
            @Override
            public void onDragDown(Component component, DragInfo dragInfo) {

            }

            @Override
            public void onDragStart(Component component, DragInfo dragInfo) {

            }

            @Override
            public void onDragUpdate(Component component, DragInfo dragInfo) {


            }

            @Override
            public void onDragEnd(Component component, DragInfo dragInfo) {

            }

            @Override
            public void onDragCancel(Component component, DragInfo dragInfo) {

            }
        });



    }




}

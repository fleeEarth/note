package com.myapp.note.slice;

import com.myapp.note.ResourceTable;
import com.myapp.note.common.CreateComponent;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.*;
import ohos.agp.components.element.Element;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.text.Font;
import ohos.agp.utils.TextAlignment;
import ohos.app.Context;
import ohos.bundle.ElementName;
import ohos.sysappcomponents.contact.entity.Organization;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        initBody();
    }


    private void initBody(){
        DirectionalLayout mainBody =  (DirectionalLayout)findComponentById(ResourceTable.Id_main_body);
//        setUIContent(ResourceTable.Layout_info_item);
//        mainBody.addComponent(findComponentById(ResourceTable.Id_info_item));
        mainBody.addComponent(createDirectionlLayout());
        PositionLayout p = (PositionLayout) findComponentById(ResourceTable.Id_mian_layout);
        Button button = createButton(getContext());
        button.setClickedListener(component -> {
            present(new AddAbilitySlice(),new Intent());
        });

        p.addComponent(button);



    }


    private static Button createButton(Context context){
        Button myButton = new Button(context);

        ShapeElement shapeElement = new ShapeElement();
        shapeElement.setCornerRadius(150);
        shapeElement.setRgbColor(new RgbColor(155,222,111));
        myButton.setBackground(shapeElement);
        myButton.setWidth(150);
        myButton.setHeight(150);
        myButton.setText("+");
        myButton.setTextSize(80);
        myButton.setPosition(800,1500);


        return myButton;


    }



    private DirectionalLayout createDirectionlLayout(){

        DirectionalLayout item = new DirectionalLayout(getContext());
        item.setHeight(ComponentContainer.LayoutConfig.MATCH_CONTENT);
        item.setWidth(ComponentContainer.LayoutConfig.MATCH_PARENT);
        item.setOrientation(Component.VERTICAL);
        ShapeElement bkcolor = new ShapeElement();
        bkcolor.setRgbColor(new RgbColor(123,123,123));
        item.setBackground(bkcolor);
        for (int i = 0;i<20;i++){
            Text title = new Text(getContext());
            title.setHeight(150);
            title.setTextSize(40);
            String s = "你好啊你好啊你好啊你好";
            title.setText(s);
            title.setMaxTextLines(1);
            title.setTextAlignment(TextAlignment.VERTICAL_CENTER);
            title.setPaddingLeft(40);

            item.addComponent(title);
        }



        return item;
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}

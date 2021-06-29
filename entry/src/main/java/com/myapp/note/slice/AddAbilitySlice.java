package com.myapp.note.slice;

import com.myapp.note.ResourceTable;
import com.myapp.note.common.CreateComponent;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.PositionLayout;
import ohos.agp.window.dialog.ToastDialog;


public class AddAbilitySlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_add);
        initBody();

    }

    private void initBody(){
        PositionLayout add = (PositionLayout) findComponentById(ResourceTable.Id_ability_add);
        Button save = (Button)findComponentById(ResourceTable.Id_save);
        save.setClickedListener(component -> {
            ToastDialog toastDialog = new ToastDialog(getContext());
            toastDialog.setText("已保存");
            toastDialog.show();
        });
        Button cancel = (Button) findComponentById(ResourceTable.Id_cancel);
        cancel.setClickedListener(component -> {
            presentForResult(new MainAbilitySlice(),new Intent(),0);
        });

    }

    @Override
    protected void onActive() {
        super.onActive();
    }

    @Override
    protected void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}

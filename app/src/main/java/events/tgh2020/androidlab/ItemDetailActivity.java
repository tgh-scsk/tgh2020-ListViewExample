package events.tgh2020.androidlab;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 前画面でクリックされたListViewの項目の詳細を、このアクティビティで表示する。
 */
public class ItemDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        Intent intent = getIntent();

        final String selectedText = intent.getStringExtra("Name");
        TextView textView = findViewById(R.id.selected_txt);
        textView.setText(selectedText);

        int selectedPic = intent.getIntExtra("Pic", 0);
        ImageView imageView = findViewById(R.id.selected_pic);
        imageView.setImageResource(selectedPic);

        String description = intent.getStringExtra("Comment");
        TextView desc = findViewById(R.id.selected_comment);
        desc.setText(description);

        // ←ボタンをクリックすると、一覧画面に戻る
        ImageButton backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener((view) -> { finish(); });
    }
}

package com.stevdza.san.readsmsdemo.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.stevdza.san.readsmsdemo.model.SMSMessage
import com.stevdza.san.readsmsdemo.model.parsedDate

@Composable
fun MessageView(message: SMSMessage) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = if (message.type == 1) Arrangement.Start else Arrangement.End
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .padding(all = 10.dp),
            shape = RoundedCornerShape(size = 12.dp),
            color = if (message.type == 1) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.primary
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 12.dp)
            ) {
                Text(text = message.message)
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    modifier = Modifier.fillMaxWidth().alpha(0.38f),
                    fontSize = MaterialTheme.typography.bodySmall.fontSize,
                    text = message.date.parsedDate().split(" ").last(),
                    textAlign = TextAlign.End
                )
            }
        }
    }
}
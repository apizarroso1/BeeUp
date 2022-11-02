package com.example.beeapp.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.beeapp.GroupActivity
import com.example.beeapp.R
import com.example.beeapp.model.Group


class GroupAdapter(val context: Context, val groupList: ArrayList<Group>) :
    RecyclerView.Adapter<GroupAdapter.GroupViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.group_layout, parent, false)

        return GroupViewHolder(view)
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val currentGroup = groupList[position]

        holder.tvGroupName.text = currentGroup.gName

        //al pulsar en el card te lleva a ala activiada chat
        holder.itemView.setOnClickListener {
            val intent = Intent(context, GroupActivity::class.java)

            intent.putExtra("groupname", currentGroup.gName)
            intent.putExtra("groupid", currentGroup.groupId)
            intent.putExtra("description",currentGroup.gDescription.toString())

            Log.e("DESCRIPCION",currentGroup.gDescription.toString())

            context.startActivity(intent)

        }
    }

    override fun getItemCount() = groupList.size

    class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvGroupName = itemView.findViewById<TextView>(R.id.tvGroupName)

    }
}
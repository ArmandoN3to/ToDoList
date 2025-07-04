package com.example.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todolist.databinding.FragmentDetailTopicBinding

// TODO: Rename parameter arguments, choose names that match

class TaskDetailFragment : Fragment() {

    private var _binding: FragmentDetailTopicBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDetailTopicBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGoBack.setOnClickListener {
            findNavController().navigate(R.id.taskDetailFragment_to_ToDoListFragment)
        }
        binding.floatingactionbuttonCreateNewTask.setOnClickListener {
            findNavController().navigate(R.id.taskDetailFragment_to_createTaskFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
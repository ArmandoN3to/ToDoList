package com.example.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todolist.databinding.FragmentToDoListBinding

// TODO: Rename parameter arguments, choose names that matc
class ToDoListFragment : Fragment() {

    private var _binding: FragmentToDoListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentToDoListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.todayTasks.setOnClickListener {
            findNavController().navigate(R.id.ToDoListFragment_to_TaskDetailFragment)
        }
        binding.upcomingTasks.setOnClickListener {
            findNavController().navigate(R.id.ToDoListFragment_to_UpcomingFragment)
        }
        binding.floatingactionbuttonCreateNewTask.setOnClickListener {
            findNavController().navigate(R.id.ToDoListFragment_to_CreateTaskFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
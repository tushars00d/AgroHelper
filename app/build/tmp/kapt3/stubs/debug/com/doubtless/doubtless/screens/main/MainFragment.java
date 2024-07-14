package com.doubtless.doubtless.screens.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0017R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/doubtless/doubtless/screens/main/MainFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/doubtless/doubtless/databinding/FragmentMainBinding;", "areBottomNavFragmentsAdded", "", "binding", "getBinding", "()Lcom/doubtless/doubtless/databinding/FragmentMainBinding;", "bottomNavFragments", "", "getCurrentSelectedElement", "Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "selectHomeBottomNavElement", "CurrentSelectedBottomNavFrag", "app_debug"})
public final class MainFragment extends androidx.fragment.app.Fragment {
    private com.doubtless.doubtless.databinding.FragmentMainBinding _binding;
    private final java.util.List<androidx.fragment.app.Fragment> bottomNavFragments = null;
    private boolean areBottomNavFragmentsAdded = false;
    
    public MainFragment() {
        super();
    }
    
    private final com.doubtless.doubtless.databinding.FragmentMainBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void selectHomeBottomNavElement() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.main.MainFragment.CurrentSelectedBottomNavFrag getCurrentSelectedElement() {
        return null;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag;", "", "()V", "CreateFrag", "DashboardFrag", "HomeFrag", "InAppNotificationFrag", "UnknownFrag", "Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag$CreateFrag;", "Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag$DashboardFrag;", "Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag$HomeFrag;", "Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag$InAppNotificationFrag;", "Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag$UnknownFrag;", "app_debug"})
    public static abstract class CurrentSelectedBottomNavFrag {
        
        private CurrentSelectedBottomNavFrag() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag$HomeFrag;", "Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag;", "()V", "app_debug"})
        public static final class HomeFrag extends com.doubtless.doubtless.screens.main.MainFragment.CurrentSelectedBottomNavFrag {
            @org.jetbrains.annotations.NotNull
            public static final com.doubtless.doubtless.screens.main.MainFragment.CurrentSelectedBottomNavFrag.HomeFrag INSTANCE = null;
            
            private HomeFrag() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag$CreateFrag;", "Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag;", "()V", "app_debug"})
        public static final class CreateFrag extends com.doubtless.doubtless.screens.main.MainFragment.CurrentSelectedBottomNavFrag {
            @org.jetbrains.annotations.NotNull
            public static final com.doubtless.doubtless.screens.main.MainFragment.CurrentSelectedBottomNavFrag.CreateFrag INSTANCE = null;
            
            private CreateFrag() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag$InAppNotificationFrag;", "Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag;", "()V", "app_debug"})
        public static final class InAppNotificationFrag extends com.doubtless.doubtless.screens.main.MainFragment.CurrentSelectedBottomNavFrag {
            @org.jetbrains.annotations.NotNull
            public static final com.doubtless.doubtless.screens.main.MainFragment.CurrentSelectedBottomNavFrag.InAppNotificationFrag INSTANCE = null;
            
            private InAppNotificationFrag() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag$DashboardFrag;", "Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag;", "()V", "app_debug"})
        public static final class DashboardFrag extends com.doubtless.doubtless.screens.main.MainFragment.CurrentSelectedBottomNavFrag {
            @org.jetbrains.annotations.NotNull
            public static final com.doubtless.doubtless.screens.main.MainFragment.CurrentSelectedBottomNavFrag.DashboardFrag INSTANCE = null;
            
            private DashboardFrag() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag$UnknownFrag;", "Lcom/doubtless/doubtless/screens/main/MainFragment$CurrentSelectedBottomNavFrag;", "()V", "app_debug"})
        public static final class UnknownFrag extends com.doubtless.doubtless.screens.main.MainFragment.CurrentSelectedBottomNavFrag {
            @org.jetbrains.annotations.NotNull
            public static final com.doubtless.doubtless.screens.main.MainFragment.CurrentSelectedBottomNavFrag.UnknownFrag INSTANCE = null;
            
            private UnknownFrag() {
                super();
            }
        }
    }
}
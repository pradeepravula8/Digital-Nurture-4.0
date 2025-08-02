import React, { useState } from 'react';
import BookDetails from './Components/BookDetails';
import BlogDetails from './Components/BlogDetails';
import CourseDetails from './Components/CourseDetails';

function App() {
  const [view, setView] = useState('none');

  const renderComponent = () => {
    if (view === 'book') {
      return <BookDetails />;
    } else if (view === 'blog') {
      return <BlogDetails />;
    } else if (view === 'course') {
      return <CourseDetails />;
    } else {
      return <p style={{ fontStyle: 'italic' }}>Please select a category to view details.</p>;
    }
  };

  return (
    <div style={{ padding: '2rem', fontFamily: 'Segoe UI, Tahoma, Geneva, Verdana, sans-serif', backgroundColor: '#f8f9fa', minHeight: '100vh' }}>
      <h1 style={{ textAlign: 'center', marginBottom: '2rem', color: '#333' }}>📚 Blogger App Dashboard</h1>

      <div style={{ display: 'flex', justifyContent: 'center', gap: '1.5rem', marginBottom: '2.5rem' }}>
        <button
          onClick={() => setView('book')}
          title="View detailed information about various books"
          style={{ padding: '0.75rem 1.5rem', backgroundColor: '#007bff', color: '#fff', border: 'none', borderRadius: '6px', cursor: 'pointer' }}
        >
          📘 Book Details
        </button>

        <button
          onClick={() => setView('blog')}
          title="Browse recent blogs and articles"
          style={{ padding: '0.75rem 1.5rem', backgroundColor: '#28a745', color: '#fff', border: 'none', borderRadius: '6px', cursor: 'pointer' }}
        >
          📝 Blog Details
        </button>

        <button
          onClick={() => setView('course')}
          title="Explore available online courses and materials"
          style={{ padding: '0.75rem 1.5rem', backgroundColor: '#ffc107', color: '#212529', border: 'none', borderRadius: '6px', cursor: 'pointer' }}
        >
          🎓 Course Details
        </button>

        <button
          onClick={() => setView('none')}
          title="Clear current selection"
          style={{ padding: '0.75rem 1.5rem', backgroundColor: '#dc3545', color: '#fff', border: 'none', borderRadius: '6px', cursor: 'pointer' }}
        >
          ❌ Clear View
        </button>
      </div>

      {renderComponent()}

      {view !== 'none' && (
        <p style={{ color: '#6c757d', marginTop: '1.5rem', textAlign: 'center' }}>
          You are currently viewing: <strong>{view.charAt(0).toUpperCase() + view.slice(1)} Details</strong>
        </p>
      )}
    </div>
  );
}

export default App;
